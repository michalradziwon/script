
  package gen;
  public class A_Gen44 {
  		@com.google.inject.Inject
  		public A_Gen44(A_Gen45 a_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  