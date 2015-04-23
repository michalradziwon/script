
  package gen;
  public class A_Gen84 {
  		@com.google.inject.Inject
  		public A_Gen84(A_Gen85 a_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  