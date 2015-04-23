
  package gen;
  public class B_Gen33 {
  		@com.google.inject.Inject
  		public B_Gen33(B_Gen34 b_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  