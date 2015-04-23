
  package gen;
  public class A_Gen164 {
  		@com.google.inject.Inject
  		public A_Gen164(A_Gen165 a_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  