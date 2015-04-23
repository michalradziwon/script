
  package gen;
  public class T_Gen29 {
  		@com.google.inject.Inject
  		public T_Gen29(T_Gen30 t_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  