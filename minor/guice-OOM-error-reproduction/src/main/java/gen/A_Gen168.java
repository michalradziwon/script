
  package gen;
  public class A_Gen168 {
  		@com.google.inject.Inject
  		public A_Gen168(A_Gen169 a_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  