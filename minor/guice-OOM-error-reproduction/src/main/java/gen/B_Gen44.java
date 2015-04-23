
  package gen;
  public class B_Gen44 {
  		@com.google.inject.Inject
  		public B_Gen44(B_Gen45 b_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  