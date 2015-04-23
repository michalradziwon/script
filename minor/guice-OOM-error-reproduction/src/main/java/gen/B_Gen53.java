
  package gen;
  public class B_Gen53 {
  		@com.google.inject.Inject
  		public B_Gen53(B_Gen54 b_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  