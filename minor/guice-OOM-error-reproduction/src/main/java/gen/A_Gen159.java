
  package gen;
  public class A_Gen159 {
  		@com.google.inject.Inject
  		public A_Gen159(A_Gen160 a_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  