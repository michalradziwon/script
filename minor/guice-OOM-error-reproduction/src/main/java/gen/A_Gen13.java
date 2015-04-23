
  package gen;
  public class A_Gen13 {
  		@com.google.inject.Inject
  		public A_Gen13(A_Gen14 a_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  