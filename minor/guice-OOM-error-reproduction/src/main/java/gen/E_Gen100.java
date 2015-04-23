
  package gen;
  public class E_Gen100 {
  		@com.google.inject.Inject
  		public E_Gen100(E_Gen101 e_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  