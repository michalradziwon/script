
  package gen;
  public class A_Gen184 {
  		@com.google.inject.Inject
  		public A_Gen184(A_Gen185 a_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  