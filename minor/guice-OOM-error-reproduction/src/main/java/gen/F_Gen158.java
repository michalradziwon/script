
  package gen;
  public class F_Gen158 {
  		@com.google.inject.Inject
  		public F_Gen158(F_Gen159 f_gen159){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen159 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  