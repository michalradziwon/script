
  package gen;
  public class M_Gen61 {
  		@com.google.inject.Inject
  		public M_Gen61(M_Gen62 m_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  