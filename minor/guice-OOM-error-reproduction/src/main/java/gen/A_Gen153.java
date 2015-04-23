
  package gen;
  public class A_Gen153 {
  		@com.google.inject.Inject
  		public A_Gen153(A_Gen154 a_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  