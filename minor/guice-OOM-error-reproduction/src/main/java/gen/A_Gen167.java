
  package gen;
  public class A_Gen167 {
  		@com.google.inject.Inject
  		public A_Gen167(A_Gen168 a_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  