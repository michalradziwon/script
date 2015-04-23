
  package gen;
  public class A_Gen166 {
  		@com.google.inject.Inject
  		public A_Gen166(A_Gen167 a_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  