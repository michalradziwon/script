
  package gen;
  public class A_Gen171 {
  		@com.google.inject.Inject
  		public A_Gen171(A_Gen172 a_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  