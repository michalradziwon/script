
  package gen;
  public class A_Gen158 {
  		@com.google.inject.Inject
  		public A_Gen158(A_Gen159 a_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  