
  package gen;
  public class A_Gen61 {
  		@com.google.inject.Inject
  		public A_Gen61(A_Gen62 a_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  