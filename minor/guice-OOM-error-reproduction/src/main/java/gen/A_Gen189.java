
  package gen;
  public class A_Gen189 {
  		@com.google.inject.Inject
  		public A_Gen189(A_Gen190 a_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  