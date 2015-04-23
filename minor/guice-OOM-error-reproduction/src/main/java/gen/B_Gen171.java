
  package gen;
  public class B_Gen171 {
  		@com.google.inject.Inject
  		public B_Gen171(B_Gen172 b_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  