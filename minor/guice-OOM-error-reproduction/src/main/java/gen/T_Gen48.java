
  package gen;
  public class T_Gen48 {
  		@com.google.inject.Inject
  		public T_Gen48(T_Gen49 t_gen49){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen49 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  