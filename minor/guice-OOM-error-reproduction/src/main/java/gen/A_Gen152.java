
  package gen;
  public class A_Gen152 {
  		@com.google.inject.Inject
  		public A_Gen152(A_Gen153 a_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  