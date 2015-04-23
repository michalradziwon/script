
  package gen;
  public class A_Gen8 {
  		@com.google.inject.Inject
  		public A_Gen8(A_Gen9 a_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  