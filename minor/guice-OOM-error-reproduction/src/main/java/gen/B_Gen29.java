
  package gen;
  public class B_Gen29 {
  		@com.google.inject.Inject
  		public B_Gen29(B_Gen30 b_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  