
  package gen;
  public class B_Gen175 {
  		@com.google.inject.Inject
  		public B_Gen175(B_Gen176 b_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  