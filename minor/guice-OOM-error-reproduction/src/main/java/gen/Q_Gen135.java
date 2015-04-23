
  package gen;
  public class Q_Gen135 {
  		@com.google.inject.Inject
  		public Q_Gen135(Q_Gen136 q_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  