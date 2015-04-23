
  package gen;
  public class E_Gen87 {
  		@com.google.inject.Inject
  		public E_Gen87(E_Gen88 e_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  