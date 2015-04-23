
  package gen;
  public class A_Gen170 {
  		@com.google.inject.Inject
  		public A_Gen170(A_Gen171 a_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  