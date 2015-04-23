
  package gen;
  public class A_Gen15 {
  		@com.google.inject.Inject
  		public A_Gen15(A_Gen16 a_gen16){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen16 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  