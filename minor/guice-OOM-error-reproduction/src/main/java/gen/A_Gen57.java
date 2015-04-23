
  package gen;
  public class A_Gen57 {
  		@com.google.inject.Inject
  		public A_Gen57(A_Gen58 a_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  