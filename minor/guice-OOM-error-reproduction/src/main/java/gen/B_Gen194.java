
  package gen;
  public class B_Gen194 {
  		@com.google.inject.Inject
  		public B_Gen194(B_Gen195 b_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  