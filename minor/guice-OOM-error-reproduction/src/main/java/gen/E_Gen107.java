
  package gen;
  public class E_Gen107 {
  		@com.google.inject.Inject
  		public E_Gen107(E_Gen108 e_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  