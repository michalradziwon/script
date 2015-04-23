
  package gen;
  public class E_Gen102 {
  		@com.google.inject.Inject
  		public E_Gen102(E_Gen103 e_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  