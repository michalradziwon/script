
  package gen;
  public class B_Gen192 {
  		@com.google.inject.Inject
  		public B_Gen192(B_Gen193 b_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  