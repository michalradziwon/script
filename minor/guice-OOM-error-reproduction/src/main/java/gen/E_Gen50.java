
  package gen;
  public class E_Gen50 {
  		@com.google.inject.Inject
  		public E_Gen50(E_Gen51 e_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + e_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  