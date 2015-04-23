
  package gen;
  public class F_Gen178 {
  		@com.google.inject.Inject
  		public F_Gen178(F_Gen179 f_gen179){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen179 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  