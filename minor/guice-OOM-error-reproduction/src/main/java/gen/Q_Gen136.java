
  package gen;
  public class Q_Gen136 {
  		@com.google.inject.Inject
  		public Q_Gen136(Q_Gen137 q_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  