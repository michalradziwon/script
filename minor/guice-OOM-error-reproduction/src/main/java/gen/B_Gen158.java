
  package gen;
  public class B_Gen158 {
  		@com.google.inject.Inject
  		public B_Gen158(B_Gen159 b_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  