
  package gen;
  public class T_Gen31 {
  		@com.google.inject.Inject
  		public T_Gen31(T_Gen32 t_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  