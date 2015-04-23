
  package gen;
  public class E_Gen63 {
  		@com.google.inject.Inject
  		public E_Gen63(E_Gen64 e_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  