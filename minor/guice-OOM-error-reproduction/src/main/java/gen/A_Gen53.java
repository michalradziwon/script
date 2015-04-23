
  package gen;
  public class A_Gen53 {
  		@com.google.inject.Inject
  		public A_Gen53(A_Gen54 a_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  