
  package gen;
  public class E_Gen170 {
  		@com.google.inject.Inject
  		public E_Gen170(E_Gen171 e_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  