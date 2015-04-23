
  package gen;
  public class A_Gen151 {
  		@com.google.inject.Inject
  		public A_Gen151(A_Gen152 a_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  