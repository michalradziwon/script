
  package gen;
  public class Q_Gen31 {
  		@com.google.inject.Inject
  		public Q_Gen31(Q_Gen32 q_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  