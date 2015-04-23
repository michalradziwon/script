
  package gen;
  public class E_Gen157 {
  		@com.google.inject.Inject
  		public E_Gen157(E_Gen158 e_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  