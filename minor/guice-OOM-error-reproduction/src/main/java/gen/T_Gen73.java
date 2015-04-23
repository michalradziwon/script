
  package gen;
  public class T_Gen73 {
  		@com.google.inject.Inject
  		public T_Gen73(T_Gen74 t_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  