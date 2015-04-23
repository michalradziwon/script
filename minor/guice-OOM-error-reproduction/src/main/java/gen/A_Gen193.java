
  package gen;
  public class A_Gen193 {
  		@com.google.inject.Inject
  		public A_Gen193(A_Gen194 a_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  