
  package gen;
  public class A_Gen43 {
  		@com.google.inject.Inject
  		public A_Gen43(A_Gen44 a_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  