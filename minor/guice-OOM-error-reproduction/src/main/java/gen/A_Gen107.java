
  package gen;
  public class A_Gen107 {
  		@com.google.inject.Inject
  		public A_Gen107(A_Gen108 a_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  