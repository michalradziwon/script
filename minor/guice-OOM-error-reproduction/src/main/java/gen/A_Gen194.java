
  package gen;
  public class A_Gen194 {
  		@com.google.inject.Inject
  		public A_Gen194(A_Gen195 a_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  