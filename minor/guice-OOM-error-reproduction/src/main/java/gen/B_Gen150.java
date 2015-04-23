
  package gen;
  public class B_Gen150 {
  		@com.google.inject.Inject
  		public B_Gen150(B_Gen151 b_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  