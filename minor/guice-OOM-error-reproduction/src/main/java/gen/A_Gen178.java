
  package gen;
  public class A_Gen178 {
  		@com.google.inject.Inject
  		public A_Gen178(A_Gen179 a_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  