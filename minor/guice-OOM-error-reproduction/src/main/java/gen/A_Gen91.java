
  package gen;
  public class A_Gen91 {
  		@com.google.inject.Inject
  		public A_Gen91(A_Gen92 a_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  